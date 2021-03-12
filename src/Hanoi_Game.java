
public class Hanoi_Game {
    Tower a;
    Tower b;
    Tower c;
    int num_of_disks;

    public Hanoi_Game(int num_of_disks) {
        a = new Tower(num_of_disks);
        b = new Tower(num_of_disks);
        c = new Tower(num_of_disks);
        this.num_of_disks = num_of_disks;
        for (int i = num_of_disks; i > 0; i--) {
            a.add(i);
        }

    }

    public static void main(String[] args) {
        Hanoi_Game game = new Hanoi_Game(3);
        game.solve();
    }

    void solve() {
        printTowers();
        move(a, b, c, num_of_disks);
    }


    void move(Tower start, Tower middle, Tower end, int number_of_disks) {
        if (number_of_disks == 1) {
            int removed_disk = start.remove();
            end.add(removed_disk);
            printTowers();
        } else {
            move(start, end, middle, number_of_disks - 1); // pomagaš si z Tower end, da prideš na Tower middle
            move(start, null, end, 1); // premakneš en disk iz začetka na konec
            move(middle, start, end, number_of_disks - 1); // pomagaš si s stratom da premakneš iz middle na end
        }
    }

    void printTowers() {
        System.out.print("A  ");
        a.print_tower();
        System.out.print("B  ");
        b.print_tower();
        System.out.print("C  ");
        c.print_tower();
        System.out.println();
    }

}


