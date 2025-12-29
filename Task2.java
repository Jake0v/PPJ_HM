abstract class Siren {
    public abstract boolean isDanger();
}

class Task2AlwaysTrue extends Siren {
    @Override
    public boolean isDanger() {
        return true;
    }
}

class ConfTask2 extends Siren {
    private boolean f;

    public ConfTask2(boolean f) {
        this.f = f;
    }

    @Override
    public boolean isDanger() {
        return f;
    }
}

class ThresholdTask2 extends Siren {
    private int n = 0;

    public ThresholdTask2(int n) {
        this.n = n;
    }

    @Override
    public boolean isDanger() {
        if (n > 50) {
            return true;
        }
        return false;
    }

}

public class Task2 {
    void main() {

        Siren[] sirens = {
                new Task2AlwaysTrue(),
                new ConfTask2(true),
                new ThresholdTask2(60),
                new ThresholdTask2(10)
        };

        int counter = 0;

        for(int i = 0; i < sirens.length; i++) {
            if (sirens[i].isDanger()) {
                counter++;
            }
        }

        if (counter > 2) {
            System.out.println("Evacuate");
        } else {
            System.out.println("Relax");
        }

    }
}