package tr.medipol.yova.OgrenciWebServisi;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

//http://localhost:8080/ogrenci/listele

@RestController				//Rest web servis sınıfı kazandırıyoruz
@RequestMapping("/ogrenci") //ogrenci ile baslayan web isteklerini bu sınıfa yönlendirir
public class OgrenciRestApi {
 
	private static final List<String> OGRENCILER = new ArrayList<>();
	{
		OGRENCILER.add("Jane");
		OGRENCILER.add("Joe");
	}
	
	@GetMapping("/listele")
	public List<String> listele(){
		return OGRENCILER;
	}
	
}
