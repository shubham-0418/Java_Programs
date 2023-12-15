
import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidEmpNumberException extends Exception {
public InvalidEmpNumberException(String message) {
super(message);
}
}

class InvalidDateOfJoiningException extends Exception {
public InvalidDateOfJoiningException(String message) {
super(message);
}
}

public class TesterEmployee {
	
	private String employeeCode;
	private String name;
	private LocalDate dateOfBirth;
	private LocalDate dateOfAppointment;

public TesterEmployee(String employeeCode, String name, LocalDate dateOfBirth, LocalDate dateOfAppointment)
throws InvalidEmpNumberException, InvalidDateOfJoiningException {
if (Integer.parseInt(employeeCode) <= 0) {
throw new InvalidEmpNumberException("Employee code must be a positive integer.");
}
this.employeeCode = employeeCode;
this.name = name;

if (dateOfBirth.isAfter(dateOfAppointment)) {
throw new InvalidDateOfJoiningException("Date of birth must be before the date of joining.");
}
this.dateOfBirth = dateOfBirth;
this.dateOfAppointment = dateOfAppointment; 
}

public String getEmployeeCode() {
return employeeCode;
}

public void setEmployeeCode(String employeeCode)throws InvalidEmpNumberException  {
	Pattern p = Pattern.compile("[0-9]");
	Matcher m = p.matcher(employeeCode);
if (!(m.matches())) {
throw new InvalidEmpNumberException("Employee code must be a positive integer.");
}
this.employeeCode = employeeCode;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public LocalDate getDateOfBirth() {
return dateOfBirth;
}

public void setDateOfBirth(LocalDate dateOfBirth) {
this.dateOfBirth = dateOfBirth;
}

public LocalDate getDateOfAppointment() {
return dateOfAppointment;
}

public void setDateOfAppointment(LocalDate dateOfAppointment) {
this.dateOfAppointment = dateOfAppointment;
}

public int getYearsOfExperience() {
return Period.between(dateOfAppointment, LocalDate.now()).getYears();
}

public static void main(String[] args) {
try {
		TesterEmployee emp = new TesterEmployee("77444", "Prem", LocalDate.of(2002, 05, 03), LocalDate.of(2023, 06, 30));
		System.out.println("Employee Code: " + emp.getEmployeeCode());
		System.out.println("Name: " + emp.getName());
		System.out.println("Date of Birth: " + emp.getDateOfBirth());
		System.out.println("Date of Appointment: " + emp.getDateOfAppointment());
		System.out.println("Years of Experience: " + emp.getYearsOfExperience());
		
	} 
	catch (InvalidEmpNumberException ex) {
		System.out.println("Error: " + ex.getMessage());
	}catch (InvalidDateOfJoiningException ex) {
		System.out.println("Error: " + ex.getMessage());
	}
}
}