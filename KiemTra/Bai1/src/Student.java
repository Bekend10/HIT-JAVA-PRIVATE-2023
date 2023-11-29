public class Student extends Person{
    private double score;

    public Student(String name, short age, Adress adress, double score) {
        super(name, age, adress);
        this.score = score;
    }



    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() + " Score : " + this.getScore() + "\n";
    }

    @Override
    public String getCapacity() {
        if(getScore() >= 9) return "Học lực xuất sắc";
        else if(getScore() >= 8 && getScore() < 9)  return "Học lực giỏi";
        else if(getScore() < 8 && getScore() >= 6.5)    return "Học lực khá";
        return "Học lực trung bình";
    }

}
