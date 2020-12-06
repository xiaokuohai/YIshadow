class MyListTest {

    public static void main(String[] args) {
        MyList myList = new MyList();
        Choice choice = new Choice();
        Doing doing = new Doing();
        doing.Doing(myList);
        for (int i = 0; i <= 999; i++) {
            System.out.println("\n你已经完成了操作\n是否继续\n1.继续2.结束");
            if (choice.choiceI() == 1) {
                doing.Doing(myList);
            } else {
                System.out.println("结束");
                break;
            }
        }
    }
}