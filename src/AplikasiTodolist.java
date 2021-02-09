public class AplikasiTodolist {

    // default 10 = ada 10 list nantinya
    public static String[] model = new String[10];

    public static void main(String[] args) {
        testAddTodoList();


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
    public static void addTodoList(String todo){
        //  apakah di sudah penuh jika dia ada yang null maka ia masih kosong jika tidak masih ada
        var isFull = true;
        for (int i = 0; i< model.length; i++){
            if (model[i] == null){
                // model masih ada yang kosong
                // jika ada ada yang penuh set dengan false
                isFull = false;
                break;
            }
        }

        // jika penuh , kita resize ukuran array 2x lipat
        if (isFull) {
            // simpan data lama
            var temp = model;
            // resize
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                // masukan data ke temp
                model[i] = temp[i];
            }
        }

        // memasukan data ke model
        // tambahkan ke posisi yang data arraynya null
        for (var i = 0; i < model.length; i++){
            // cek apakah indexnya null baru di masukkan
            if(model[i] == null){
                model[i] = todo;
                break; // selesai jika sudah dimasukkan ke yang null
            }
        }
    }
    // test add Todolist
    public static void testAddTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("tiga");
        for (int i = 0; i < 25; i++) {
            addTodoList("Contoh todo ke: " + i);
        }
        showTodoList();
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
