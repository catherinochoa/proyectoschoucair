package pageobject;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.seleniumeasy.com/test/")
public class SeleniumOpcionesPageObject extends PageObject {
	
	//Seleccionar la opción
	@FindBy(id="basic_example")
	public WebElementFacade opcionBasico;
	
	@FindBy(xpath="//*[@id=\"basic\"]/div/a[1]")
	public WebElementFacade opcionSimpleFormDemo;
	
	@FindBy(xpath="//*[@id=\"basic\"]/div/a[2]")
	public WebElementFacade opcionCheckBoxDemo;
		
	@FindBy(xpath="//*[@id=\"basic\"]/div/a[3]")
	public WebElementFacade opcionRadioButtonDemo;
	
	@FindBy(xpath="//*[@id=\"basic\"]/div/a[4]")
	public WebElementFacade opcionSelectList;
	
	@FindBy(xpath="//*[@id=\"basic\"]/div/a[5]")
	public WebElementFacade opcionJavaScript;
	
	
	//Opcion intermedio
	@FindBy(xpath="//*[@id=\"inter_example\"]/span/i")
	public WebElementFacade opcionIntermedio;
	
	@FindBy(xpath="//*[@id=\"intermediate\"]/div/a[3]")
	public WebElementFacade opcionJQuery;
	
	//opción avanzado
	@FindBy(id="advanced_example")
	public WebElementFacade opcionAvanzado;
	
	@FindBy(xpath="//*[@id=\"advanced\"]/div/a[2]")
	public WebElementFacade opcionTableDataSearch;
	
	
	public void click_opcion_basico() {
		opcionBasico.click();
    }
	
	public void click_opcion_simple_form() {
		opcionSimpleFormDemo.click();
    }

	public void click_opcion_check_box() {
		opcionCheckBoxDemo.click();
    }

	public void click_opcion_radio_button() {
		opcionRadioButtonDemo.click();		
	}
	
	public void click_opcion_seleccionar_lista() {
		opcionSelectList.click();		
	}
	
	public void click_opcion_intermedio() {
		opcionIntermedio.click();		
	}
	
	public void click_opcion_jquery_dropdown() {
		opcionJQuery.click();		
	}
	
	public void click_opcion_avanzado() {
		opcionAvanzado.click();		
	}
	
	public void click_opcion_table_data_search() {
		opcionTableDataSearch.click();		
	}
	
	public void click_opcion_javascript_alerts() {
		opcionJavaScript.click();		
	}
}
