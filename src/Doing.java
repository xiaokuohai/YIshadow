public class Doing {
    void Doing(MyList myList) {
        Choice choice = new Choice();
        System.out.println("选择你接下来的操作：\n1.添加一个元素\n2.删除一个元素\n3.检查一个下标的元素\n4.获得链表大小\n5.输出所有对象");
        switch (choice.choiceI()) {
            case 1:
                String i = choice.choiceS();
                myList.add(i);
                break;
            case 2:
                System.out.println("1.使用检索下标删除\n2.使用检索元素删除");
                if (choice.choiceI() == 1) {
                    int j = choice.choiceI();
                    System.out.println("删除下标为" + j + "的元素：");
                    myList.remove(j);
                } else if (choice.choiceI() == 2) {
                    String j = choice.choiceS();
                    myList.remove(j);
                } else if (myList.isEmpty()) {
                    System.out.println("数组已空");
                }
                break;
            case 3:
                int j = choice.choiceI();
                System.out.println("获取下标为" + j + "个元素的大小：");
                System.out.println(myList.get(j));
                break;
            case 4:
                System.out.println("获取链表大小：");
                System.out.println(myList.size());
                break;
            case 5:
                Iterator<String> it = myList.Itr();//迭代输出
                while (it.hasNext()) {
                    System.out.print(it.next() + " ");
                }
                break;
        }
    }
}