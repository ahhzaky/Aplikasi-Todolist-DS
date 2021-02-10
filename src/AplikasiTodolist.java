public class AplikasiTodolist {

    // default 10 = ada 10 list nantinya
    public static String[] model = new String[10];

    // varible scanner nanti diambil dari System.in
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        testviewAddTodoList();

    }

    /**
     * menampilkan todo list
     */
    public static void showTodoList(){
        System.out.println("TODOLIST");
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
    public static boolean removeTodoList(Integer number){
        // dilakukan pengecekan ka ada input number salah;
        // kenapa -1 karena tadi diinput dari 1 dan dibaca oleh index adalh 0
        if (number - 1 >= model.length){
            return false; // ini gagal dari kapasitas

        }else if (model[number - 1] == null){
            // jika data null berarti tidak valid juga
            return false;
        }else {
            // logic untuk geser yang telah di hapus
            for (int i = (number - 1); i < model.length; i++) {
                // cek agar index tidak indexoutofbound
                if (i == model.length - 1) {
                    model[i] = null; // bukan data yang di ujung
                } else {
                    model[i] = model[i+1];  // i yang sekarang ke index yang selanjutnya
                }
            }
            return true; // maka ia bisa di hapus
        }
    }
    // test menghapus
    public static void testRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        addTodoList("Enam");

        var reulst = removeTodoList(20);
        System.out.println(reulst);

        reulst = removeTodoList(2);
        System.out.println(reulst);

        showTodoList();

    }



    // input dari user
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    // test input
    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    // menampilkan view todolist
    public static void viewShowTodoList(){
        while (true) {
            showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            // input dari user
            var input = input("Pilih");
            if (input.equals("1")){
                viewAddTodoList();
            } else if (input.equals("2")){
                viewRemoveTodoList();
            } else if (input.equals("x")){
                break;
            }
            else {
                System.out.println("Pilihan tidak ada");
            }
        }
    }

    public static void testviewShowTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat roda");
        addTodoList("lima baja");
        viewShowTodoList();
    }

    // menampilkan view tambah todolist
    public static void viewAddTodoList(){
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("Todo (x Jika Batal)");

        if (todo.equals("x")){
            // batal
        } else {
            addTodoList(todo);
        }
    }

    // test viewAddTodoList()
    public static void testviewAddTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");

        viewAddTodoList();

        showTodoList();
    }

    // menampilkan view hapus todolist
    public static void viewRemoveTodoList(){

    }

}
