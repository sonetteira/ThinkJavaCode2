public class QuizQuestions {
    
    public static int method1(String[] array, String str) {
        for(int i=0; i < array.length; i++) {
            if(array[i].equalsIgnoreCase(str))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        
        // Object twist = new Twist();
        // twist.toString();

        // Instrument inst1 = new Cymbol();
        // inst1.play();

        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]);
        int new = 10;

    }

}


class Twist {

}

class Instrument {
	public void play() {
		System.out.println("music");
	}
}

class Cymbol extends Instrument {
    @Override
	public void play() {
		System.out.println("Crash!!!");
	}
}

