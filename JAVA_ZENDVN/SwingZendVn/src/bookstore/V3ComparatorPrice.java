/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.util.Comparator;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class V3ComparatorPrice implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(((Book)o1).getPrice() > ((Book)o2).getPrice()) return 1;
        else if(((Book)o1).getPrice() < ((Book)o2).getPrice()) return -1;
        else return 0;
    }
    
}
