/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section9.Interfaces;

import java.util.List;

/**
 *
 * @author FRIEDRICH
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
