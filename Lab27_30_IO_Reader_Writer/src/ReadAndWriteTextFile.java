import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

 class ReadAndWriteTextFile {

	List<Employee> employees = new ArrayList<>();
	
	void populateEmployee() {
		employees.add(new Employee(0001, "This", "Guy"));
		employees.add(new Employee(0002, "That", "Guy"));
		employees.add(new Employee(0003, "Those", "Guys"));
	}
	
	void writeFile() {
		File outputFile = new File("DereksPeople.txt");
		System.out.println(outputFile.exists());
		
		try(BufferedWriter bw =
				new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile)))){
		for (Employee employee : employees) {
			bw.write(employee.getEmpID() + ",");
			bw.write(employee.getLastName() + ",");
			bw.write(employee.getFirstName() + "\n");
		}
			
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
		
}
	
	void readFile()  {
		try(BufferedReader br =
				new BufferedReader(new InputStreamReader(new FileInputStream("DereksPeople.txt")))){
		String line = "";
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
		
	
	
	
	
	public static void main (String[] args) {
		ReadAndWriteTextFile rwtf = new ReadAndWriteTextFile();
		rwtf.populateEmployee();
		rwtf.writeFile();
		rwtf.readFile();
	}
 }
