public class AplikasiTodolist {

    // default 10 = ada 10 list nantinya
    public static String[] model = new String[10];

    public static void main(String[] args) {
        testshowTodoList();


    }

    /**
     * menampilkan todo list
     */
    public static void showTodoList(){
        for (var i = 0; i < model.length; i++){
            // ambil data dari String array
            String todo = model[i];
            // ini agar di tambah dari satu, jadi di array index 0
            var no = i + 1;
            // jika data null tidak di tampilkan
            if (todo != null){
                System.out.println(no +". "+todo);
            }
        }
    }
    // uji test
    public static void testshowTodoList(){
        model[0] = "Belajar todolist";
        model[1] = "Belajar todolist dari youtube";
        model[2] = "Belajar todolist dari IDEA";
        showTodoList();

    }
    /**
     * menambahkan Todo ke list
     */
    public static void addTodoList(){

    }

    /**
     * hapus todo dari list
     */
    public static void removeTodoList(){

    }

    // menampilkan view todolist
    public static void viewShowTodoList(){

    }

    // menampilkan view tambah todolist
    public static void viewAddTodoList(){

    }

    // menampilkan view hapus todolist
    public static void viewRemoveTodoList(){

    }

}
