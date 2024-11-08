package Bupasha;

public class DVD extends Product{
    private int length;
    private String rating;
    private String studio;



	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getAudio() {
		return this.studio;
	}

	public void setAudio(String audio) {
		this.studio = studio;
	}

    public DVD(String number, String nama, int quantity, double price, int length2, String rating2, int audio, String studio2) {
        super();
        length = 0;
        rating = "";
        studio = "";
    }

     // Constructor Berparameter
    public DVD(int number, String nama, int quantity, double price, int length, String rating, String audio) {
        super(number, nama, quantity, price); // Memanggil constructor berparameter
        this.rating = rating;
        this.studio = studio;
    }
	public void print() {
		super.print();
		System.out.println("Length :" +length);
        System.out.println("Rating :" +rating);
        System.out.println("Studio :" +studio);
    
	}

} 