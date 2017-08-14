/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap02.oopbasic;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Student extends Person{
    private double score;
    
    /**
     * @return the score
     */
    public double getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(double score) {
        this.score = score;
    }
    
    public void showInfo(){
        super.showInfo();
        System.out.println("Score: " + this.getScore());
    }

    @Override
    public String toString() {
        String sString = super.toString();
        return sString + "\nScore: " + this.getScore();
    }
    
}
