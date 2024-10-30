public class Main {

    public static void main(String args[]) {

        /* запуск 1 задания */
        Employee employee = new Employee("Потапов", "Никита", "Владимирович", "Инженер", "nvp01@gmail.com", "+79083385311",29999,29);
        employee.displayInfo();


        /* запуск 2 задания */
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Семин", "Алексей", "Иванович", "инженер", "semin@mail.ru","899999999", 30000,120);
        employeeArray[1] = new Employee("Петров", "Константин", "Федорович", "бухгалтер", "kovach@mail.ru", "123213123", 100000,25);
        employeeArray[2] = new Employee("Покровский", "Андрей", "Семёнович", "Директор", "pokr@mail.ru", "11111113", 15, 26);
        employeeArray[3] = new Employee("Потапов", "Никита", "Владимирович","Тестеровщик", "nvp01@gmail.com", "133451241", 5000,132);
        employeeArray[4] = new Employee("Пономарев", "Дмитрий", "Максимович", "Кадровик", "maybe@mail.ru", "987223414", 991,111);

        for (Employee employee2 : employeeArray) {
            employee2.displayInfo();

            /*запуск 3 задания */
        }
        Park park = new Park();
        park.showAttractions();
    }
}