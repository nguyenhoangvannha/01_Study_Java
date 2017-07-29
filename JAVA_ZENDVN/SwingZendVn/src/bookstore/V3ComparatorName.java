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
public class V3ComparatorName implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Book book1 = (Book) o1;
        Book book2 = (Book) o2;
        return book1.getName().compareTo(book2.getName());
    }
    
}
