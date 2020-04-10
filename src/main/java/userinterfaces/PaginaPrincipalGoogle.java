package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipalGoogle {
    public static final Target  BUSCAR_TRADUCTOR=Target.the("busqueda del traductor").located(By.xpath("//INPUT[@class='gLFyf gsfi']"));
    //public static final Target CLICK_BUSCAR=Target.the("buscar").located(By.xpath("//div[@class='list-group']//a"));
    public static final Target SELECCIONAR_IDICOMA1_=Target.the("abre la barra de idiomas").located(By.xpath("//div[@class='sl-more tlid-open-source-language-list']"));
    public static final Target SELECCIONAR_IDICOMA_INICIAL=Target.the("selecciona idioma inicial").located(By.xpath("//*[@class='sl-sugg']//div[@id='sugg-item-es']"));
    public static final Target SELECCIONAR_IDICOMA2=Target.the("selecciona idioma final").located(By.xpath("//div[@class='tl-more tlid-open-target-language-list']"));
    public static final Target SELECCIONAR_IDICOMA_FINAL=Target.the("selecciona idioma final").located(By.xpath("//div[@class='tl-sugg']//div[@id='sugg-item-en']"));
    public static final Target CAJA_DE_TEXTO=Target.the("La caja de texto del traductor").located(By.id("source"));
    public static final Target SELECT_TRADUCTORGOOGLE=Target.the("Selecciona traductor google").located(By.xpath("//h3[contains(.,'Traductor de Google')]"));
    public static final Target VERIFICAR_LA_PALABRA=Target.the("Selecciona traductor google").located(By.xpath("//div[@class='result tlid-copy-target']//div//span[text()='{0}']"));

}
