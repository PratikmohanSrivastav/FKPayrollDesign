

//// The code that I have written till the time of submission has some features implemented completely ///

/// These features are Addition , Deletion and Modification of Employee Details and running payday ////

/// I am yet to write code for implementing Commision and deductions because of being part of Union and also Deduction because of service chargs///


//// It took quite a lot of time for me to really be able to understand and grasp the programming concepts taught by sir and be able to understand how these features should//

//Be implemented as per the paradigms set up by sir //

// Hence Keeping this is mind Please consider adding,deleting,modifying and running Payday while testing ////

// Thanks Amarjit Sir for teaching me all the concepts ///

// Please also take care that since I have used the org.joda library , hence please take care while compiling and running ////

/// Please have the .jar file that I have included in the library section of my repository downloaded , before you compile or run the code  ///

/// and then if all the .java files are in the same foder as the .jar file that I have mentioned above///

/// then the following commands should be used ///

////   javac -cp '.:joda-time-2.10.6.jar' Tester.java -d .  ///////////

///    java -cp '.:joda-time-2.10.6.jar' Tester -d .        //////////


/// Please take care to download the .jar file ////


/// Moreover since I am not familiar with databases and I was short on time , hence I am doing it as static data only ////



import java.util.*;



import org.joda.time.DateTime;


public class Tester{
	public static void main(String[] args){
		int empID_0 = 100;
		int empID_1 = 101;
		int empID_2 = 102;
		int empID_3 = 103;


		PayrollDatabase db = new PayrollDatabase();



		////  Here we are adding 4 different employees////

		////*****************//////////

		MonthlyEmpAdd t0 = new MonthlyEmpAdd(empID_0, "Pratik", "kanpur", "Cheque",true,0.00,1000.00, db);
    	t0.execute();

    	HourEmpAdd t1 = new HourEmpAdd(empID_1, "Mohan", "Aligarh","Cheque",false,1.00, 12.75, db);
    	t1.execute();

    	MonthlyEmpAdd t2 = new MonthlyEmpAdd(empID_2, "Srivastav", "Kannauj", "Post",true,0.00,6000.00, db);
    	t2.execute();

    	HourEmpAdd t3 = new HourEmpAdd(empID_3, "Lily", "Raebareily","Cheque",false,1.00, 15.75, db);
    	t3.execute();

    	/// Printing ID's of different employees  ///////////////

    	System.out.printf("Added Employees as follows , : Salaried Employees with Employee ID as %d and %d and Weekly Employees with Employee ID as %d and %d\n",empID_0,empID_2,empID_1,empID_3);
		

    	///// Here We will be executing the payday function for all of them /////

    	DateTime payDate = new DateTime(2018, 11, 30, 0, 0);

    	//Adding  two time cards each for both ///


    	new AddTimeCard(payDate.minusDays(2), 4.0, empID_1, db).execute();
    	new AddTimeCard(payDate.minusDays(1), 3.0, empID_1, db).execute();


    	/// The first time card that we have added will not be counted as it will be after the date of payment /// 

    	/// Moreover the day that will be counted will also have overtime triggered ///  
    	new AddTimeCard(payDate.plusDays(1), 4.0, empID_3, db).execute();
    	new AddTimeCard(payDate.minusDays(1), 10.0, empID_3, db).execute();



    	Payday pt = new Payday(payDate, db);
    	pt.execute();

    	Paycheck pc0 = pt.getPaycheck(empID_0);
    	Paycheck pc1 = pt.getPaycheck(empID_1);
    	Paycheck pc2 = pt.getPaycheck(empID_2);
    	Paycheck pc3 = pt.getPaycheck(empID_3);

    	System.out.printf("ID: %d and Amount to be paid is : %f\n",empID_0,pc0.netPay);
    	System.out.printf("ID: %d and Amount to be paid is : %f\n",empID_1,pc1.netPay);
    	System.out.printf("ID: %d and Amount to be paid is : %f\n",empID_2,pc2.netPay);
    	System.out.printf("ID: %d and Amount to be paid is : %f\n",empID_3,pc3.netPay);



    	/// Example Showing Modification of Name ///

    	/// similarly We can also Have modification of Address///

    	/// Modification of Pay_method ///

    	/// Modification of Commision_rate ///


    	Employee e = db.getEmployee(empID_0);
    	String before = e.emp_name;

    	EmpNameChange cnt = new EmpNameChange(empID_0, "NewPratik", db);
        cnt.execute();

        e = db.getEmployee(empID_0);
        String after = e.emp_name;

        System.out.printf("Name Before: %s  and  after: %s   \n",before,after);

	}
}