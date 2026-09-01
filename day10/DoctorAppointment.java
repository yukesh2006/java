package day10;
import java.util.Arrays;
import java.util.Comparator;

	class Appointment {
	    String patient;
	    int start;
	    int end;

	    Appointment(String patient, int start, int end) {
	        this.patient = patient;
	        this.start = start;
	        this.end = end;
	    }
	}

	public class DoctorAppointment {

	    public static void main(String[] args) {

	        Appointment[] appointments = {
	            new Appointment("Patient A", 9, 10),
	            new Appointment("Patient B", 9, 11),
	            new Appointment("Patient C", 10, 12),
	            new Appointment("Patient D", 11, 12),
	            new Appointment("Patient E", 12, 13)
	        };

	       
	        Arrays.sort(appointments, Comparator.comparingInt(a -> a.end));

	        System.out.println(" Doctor's Selected Appointments:\n");

	        int lastEndTime = 0;

	        for (Appointment a : appointments) {

	            
	            if (a.start >= lastEndTime) {

	                System.out.println(
	                    a.patient + " : " +
	                    a.start + " to " + a.end
	                );

	                lastEndTime = a.end;
	            }
	        }
	    }
	}