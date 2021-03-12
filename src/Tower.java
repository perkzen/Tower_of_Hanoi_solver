public class Tower {
    private final int[] tower;
    private int num_of_disks; // number of disks

    public Tower(int num) {
        tower = new int[num];
        num_of_disks = 0;
    }

    public void add(int new_disk) {
        if (num_of_disks == 0) {
            tower[num_of_disks] = new_disk;
            num_of_disks++;
        } else if (tower[num_of_disks - 1] > new_disk || num_of_disks < tower.length) {
            tower[num_of_disks] = new_disk;
            num_of_disks++;
        }
    }

    public int remove() {
        if (num_of_disks > 0) {
            int removed_disk = tower[num_of_disks - 1];
            tower[num_of_disks - 1] = 0;
            num_of_disks -= 1;
            return removed_disk;
        }
        return 0;
    }

    public void print_tower() {
        for (int i = 0; i < tower.length; i++) {
            System.out.print(tower[i] + " ");
        }
        System.out.println();
    }
}
