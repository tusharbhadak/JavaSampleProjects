/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface MathSecondBeanLocal {
    
    int product(int x, int y);
    int divide(int x, int y);
    
}