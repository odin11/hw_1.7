package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //task1
        String firstName = "Johan";
        String middleName = "Lvovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName ;
        System.out.println("ФИО сотрудника — "+ fullName);

    //task2
        String forBuhOtdel = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + forBuhOtdel);

    //task3
        String forAdmOtdel = fullName.replace(" ",";");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + forAdmOtdel);

    //task4
        //"Может потребоваться метод split() и метод contains()."
        String fullname4 = "Иванов Семён Семёнович";
        String fullnameE = fullname4.replaceAll("ё","е");
        System.out.println(fullnameE);
    }
}
