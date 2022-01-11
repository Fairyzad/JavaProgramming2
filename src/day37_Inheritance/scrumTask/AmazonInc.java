package day37_Inheritance.scrumTask;

public class AmazonInc {
    String company = "Amazon Inc";

    ProductOwner po = new ProductOwner("Kira",38,'F',17,160000,company);

    BusinessAnalyst ba = new BusinessAnalyst("Nadi",40,'F',26,150000,company);

    ScrumMaster sm = new ScrumMaster("Eva",27,'F',12,110000,company);

    Tester tester1=new Tester("Chinara",32,'F',"QA",1,125000,company);

    Tester tester2=new Tester("Yasaman",31,'F',"QE",5,130000,company);

    Tester tester3=new Tester("Irena",29,'F',"SDET",8,128000,company);

    Tester tester4=new Tester("Cihad",26,'M',"QA",4,125000,company);

    Tester[] testers={tester1,tester2,tester3,tester4};


}
