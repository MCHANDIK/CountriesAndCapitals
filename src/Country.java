import java.util.Map;
import java.util.HashMap;

public class Country {
    
    private Map<String,String> countryMap=new HashMap<String,String>();

        // Write code for getter and setter
    public Country(){
        this.countryMap=new HashMap<String,String>();
    }
    
    public void setCountryMap(Map<String,String> countryMap){
        this.countryMap=countryMap;
    }
    
    public Map<String,String> getCountryMap(){
        return countryMap;
    }

    public void add(String cname,String capname)
    {
	    // Code here
	    for(String i: countryMap.keySet()){
	        if(i.equalsIgnoreCase(cname)){
	            return;
	        }
	    }
	    countryMap.put(cname,capname);
	    
	    
    }

    public String search(String cname)
    {
	    // Code  here
        String res = countryMap.get(cname);
	    if(res!=null){
	        return res;
	    }else{
	        return "Data not found";
	    }
    }
}