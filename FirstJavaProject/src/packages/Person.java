package packages;

import java.time.LocalDate;

public class Person {
    private String name;
    private Document document;
    private LocalDate birth;
    private String occupation;

    public Person(String name, Document document, LocalDate birth, String occupation){
        this.name = name;
        this.document = document;
        this.birth = birth;
        this.occupation = occupation;
    }

    public int calculateAge(){
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - birth.getYear();

        if(birth.getMonthValue() > currentDate.getMonthValue() || (birth.getMonthValue() == currentDate.getMonthValue() && birth.getDayOfMonth() > currentDate.getDayOfMonth())) {
            age--;
        }

        return age;
    }

    public String getName(){
        return name;
    }

    public Document getDocument(){
        return document;
    }

    public LocalDate getBirth(){
        return birth;
    }

    public String getOccupation(){
        return occupation;
    }
}
