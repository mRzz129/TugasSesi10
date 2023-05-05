import java.util.LinkedList;
import java.util.Queue;

public class TodoList {

    public static void main(String[] args) {

        Queue<String> todoList = new LinkedList<>();

        todoList.add("Bangun tidur");
        todoList.add("Sarapan pagi");
        todoList.add("Ngopi dan merokok");
        todoList.add("Mandi dan bersih-bersih");
        todoList.add("Berangkat ke tempat kuliah");
        todoList.add("Makan siang");
        todoList.add("Melanjutkan aktivitas di tempat kuliah");
        todoList.add("Pulang ke rumah");
        todoList.add("Makan malam");
        todoList.add("Beristirahat atau menyelesaikan pekerjaan rumah");
        todoList.add("Nonton you tube sambil rebahan");
        todoList.add("Tidur");

        System.out.println("Todo List:");
        while (!todoList.isEmpty()) {
            System.out.println(todoList.remove());
        }
    }
}
