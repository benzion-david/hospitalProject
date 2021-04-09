import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalStatistics {
	public static void printNumofPersonInHospital(Hospital h) {
		List<Person> persons = new ArrayList<Person>();

		for (Room r : h.rooms) {
			persons.add(r.doctor);
			persons.add(r.nurse);
			persons.addAll(Arrays.asList(r.patients));
		}
		System.out.println(persons.size());

	}

	public static void printAverageHealingTime(Hospital h) {
		List<Patient> patients = new ArrayList<Patient>();

		for (Room r : h.rooms) {
			patients.addAll(Arrays.asList(r.patients));
		}

		int totalTime = 0;
		int count = 0;
		for (Patient p : patients) {
			totalTime += p.disease.timeToCure;
			count++;
		}
		System.out.println(totalTime / count);

	}

	public static void printAverageHealingTimeForEachDisease(Hospital h) {

		// WE WANT SYSO-style:
		// disease-name D0 D1 D2 D3 D4 // Disease []
		// average-healing-time t0 t1 t2 t3 t4 // int []
		// ? Map

		List<Patient> patients = new ArrayList<Patient>();

		for (Room r : h.rooms) {
			patients.addAll(Arrays.asList(r.patients));
		}

		// מתודת פשרה
		// -------------- BENTZI and Doron Do average healing time for ALL 5 diseases:

		int[] counterForEachDisease = new int[DiseaseDescription.values().length];
		int[] timeTotalForEachDisease = new int[DiseaseDescription.values().length];

		for (Patient p : patients) {
			int idx = p.disease.diseaseDescription.ordinal();
			// debug test:
			// System.out.println(idx);
			counterForEachDisease[idx]++;
			timeTotalForEachDisease[idx] += p.disease.timeToCure;
		}

		// debug testing:
//		System.out.println("disease counter:");
//		System.out.println(Arrays.toString(counterForEachDisease));
//		System.out.println("time total for each disease");
//		System.out.println(Arrays.toString(timeTotalForEachDisease));

		Map<DiseaseDescription, Integer> map = new HashMap<DiseaseDescription, Integer>();

		for (int i = 0; i < 5; i++) {
			map.put(DiseaseDescription.values()[i], timeTotalForEachDisease[i] / counterForEachDisease[i]);
		}

		System.out.println("Average time for each disease:");
		System.out.println();

		System.out.println("print method:\tSystem.out.println(map);");
		System.out.println(map);

		System.out.println();

		System.out.println("print method:\tmap.entrySet().forEach(System.out::println);");
		map.entrySet().forEach(System.out::println);

	}

	// -------------- end average for ALL 5 diseases

//		// -------------- BENTZI Does coviD:
//
//		int counterCovid = 0;
//		int timeTotalCovid = 0;
//		for (Patient p : patients) {
//			if (p.disease.diseaseDescription == DiseaseDescription.Covid) {
//				counterCovid++;
//				timeTotalCovid += p.disease.timeToCure;
//			}
//		}
//		
//		System.out.println("The average healing time for Covid is:  " + timeTotalCovid/counterCovid);
//
//		// -------------- end coviD

}