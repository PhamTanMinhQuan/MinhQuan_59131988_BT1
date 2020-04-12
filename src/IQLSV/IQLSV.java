/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IQLSV;
import List.CaNhan;
import java.util.ArrayList;
/**
 *
 * @author quan
 */
public interface IQLSV {
    public int them(CaNhan caNhan);
    public int xoa(String ten);
    public void inDS(ArrayList<CaNhan> ds);
}
