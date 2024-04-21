public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();
        
        // Menambahkan elemen ke dalam queue menggunakan operasi enqueue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        // Menampilkan elemen yang ada di dalam queue
        queue.displayElements();
        
        // Menampilkan elemen pertama dalam queue
        System.out.println("Elemen pertama dalam queue: " + queue.front());
        
        // Menampilkan ukuran queue
        System.out.println("Ukuran queue: " + queue.size());
        
        // Memeriksa apakah queue kosong atau tidak
        System.out.println("Apakah queue kosong? " + queue.isEmpty());
    }
}
