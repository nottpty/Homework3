import java.util.ArrayList;
import java.util.List;

/**
 * This class contain recursion method.
 * 
 * @author Patinya Yongyai
 *
 */
public class Recursion {
	/**
	* Remove duplicate consecutive items from a list, changing the list parameter.
	* For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
	* will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
	* Objects are compared using their own equals method.
	* @param list of any kind of object. The elements are not null.
	* @return reference to the list parameter with consecutive duplicates removed. */
	public static List unique(List list){
		try {
			if(list.size() == 1){
				return list;
			}
			if(list.get(list.size()-1).equals(list.get(list.size()-2))){
				list.remove(list.size()-1);
				return unique(list);
			}
			unique(list.subList(0, list.size()-1));
			return list;
		} catch(Exception e) {
			throw new NullPointerException();
		}
	}
}
