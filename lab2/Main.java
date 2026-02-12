import java.util.Scanner;

/* ===================== 1-ТАПСЫРМА ===================== */
/*
fclass1 -> негізгі класс (main)
fclass3 -> fclass1-ден мұрагерлік алады
fclass2 -> fclass3-тен мұрагерлік алады
*/

class fclass1 {
    void show1() {
        System.out.println("Бұл fclass1 класы");
    }
}

class fclass3 extends fclass1 {
    void show3() {
        System.out.println("Бұл fclass3 класы (fclass1-ден мұрагер)");
    }
}

class fclass2 extends fclass3 {
    void show2() {
        System.out.println("Бұл fclass2 класы (fclass3-тен мұрагер)");
    }
}


/* ===================== 2-ТАПСЫРМА ===================== */
/*
fclass1_2 -> main орналасқан
fclass2_2 -> fclass1_2 айнымалыларын енгізетін әдіс
*/

class fclass1_2 {
    String name;
    int age;

    public static void main(String[] args) {
        fclass1_2 obj = new fclass1_2();
        fclass2_2 input = new fclass2_2();

        input.enterData(obj);

        System.out.println("Аты: " + obj.name);
        System.out.println("Жасы: " + obj.age);

        // 1-тапсырманы тексеру
        System.out.println("\n1-тапсырма тексеру:");
        fclass2 test = new fclass2();
        test.show1();
        test.show3();
        test.show2();

        // 3-тапсырма тексеру
        System.out.println("\n3-тапсырма тексеру:");
        kafedra k = new kafedra();
        k.showStudent();
        k.showUniver();
        k.showKafedra();

        // 4-тапсырма тексеру
        System.out.println("\n4-тапсырма тексеру:");
        Lab lab = new Lab();
        Lec lec = new Lec();
        lec.enterLabData(lab);
        lab.showLab();
    }
}

class fclass2_2 {
    void enterData(fclass1_2 obj) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Атыңызды енгізіңіз: ");
        obj.name = sc.nextLine();
        System.out.print("Жасыңызды енгізіңіз: ");
        obj.age = sc.nextInt();
    }
}


/* ===================== 3-ТАПСЫРМА ===================== */
/*
Student -> негізгі класс
uniber -> student-тен мұрагер
kafedra -> uniber-тен мұрагер
*/

class Student {
    void showStudent() {
        System.out.println("Бұл Student класы");
    }
}

class uniber extends Student {
    void showUniver() {
        System.out.println("Бұл uniber класы (Student-тен мұрагер)");
    }
}

class kafedra extends uniber {
    void showKafedra() {
        System.out.println("Бұл kafedra класы (uniber-тен мұрагер)");
    }
}


/* ===================== 4-ТАПСЫРМА ===================== */
/*
Lab -> негізгі класс
Lec -> Lab айнымалыларын енгізетін класс
*/

class Lab {
    String labName;
    int hours;

    void showLab() {
        System.out.println("Зертхана атауы: " + labName);
        System.out.println("Сағат саны: " + hours);
    }
}

class Lec {
    void enterLabData(Lab lab) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Зертхана атауын енгізіңіз: ");
        lab.labName = sc.nextLine();
        System.out.print("Сағат санын енгізіңіз: ");
        lab.hours = sc.nextInt();
    }
}
