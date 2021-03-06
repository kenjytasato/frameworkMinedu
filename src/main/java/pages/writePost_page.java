package pages;

import driver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class writePost_page {


   // @FindBy(xpath = "//*[@id='content']/div/div[5]/main/main/div/div[2]/div[2]/input")
    @FindBy(xpath = "//*[@id='content']/div/div[5]/main/div/main/div/div[2]/div[2]/input")

    WebElement postTitle;

    // @FindBy(xpath="//*[@class='DraftEditor-root']")


    //@FindBy(xpath = "//*[@id='richPublisher']/div/div[2]/div/div/div[2]/div/div/div/div")
    @FindBy(xpath = "//*[@id='richPublisher']/div/div[2]")
    WebElement postBody;


    @FindBy(xpath = "//*[@id='content']/div/div[5]/main/div/aside/div[1]/div[2]/div[1]/button")
    WebElement postNSFWbtn;


    @FindBy(xpath = "//*[@id='content']/div/div[5]/main/div/aside/div[1]/div[2]/form[1]/input")
    WebElement postTags;

    @FindBy(xpath = "//*[@id='content']/div/div[4]/main/aside/div[1]/div[2]/form[2]/div/input")
    WebElement postSources;
    @FindBy(xpath = "//*[@id='content']/div/div[4]/main/aside/div[1]/div[2]/button")
    WebElement postSourcesBtn;
    //@FindBy(xpath = "//*[@id='content']/div/div[5]/main/aside/div[1]/div[2]/button")
    @FindBy(xpath = "//*[@id='content']/div/div[5]/main/div/aside/div[1]/div[2]/button[1]")
        WebElement postPublish;
    @FindBy(xpath = "//button[@id='content']")
    WebElement postDisclaimer;
    @FindBy(xpath = "//button[@id='content']")
    WebElement postAlienNotice;
///hasta aqui corrgido

    @FindBy(xpath = "//*[@id='content']/div/div[5]/main/div/main/div/div[2]/div[1]/div/div/div[1]")
    WebElement channel;

    @FindBy(xpath = "//*[@id='content']/div/div[5]/main/div/main/div/div[2]/div[1]/div/div/div[2]/div[1]/input")
    WebElement channelText;
    @FindBy(xpath = "//*[@id='content']/div/div[5]/main/div/main/div/div[2]/div[1]/div/div/div[2]/ul[2]/li[1]/div[1]")
    WebElement channelOption;
////////
    @FindBy(xpath = "//*[@id='richPublisher']/div/div[1]/div[2]/div")
    WebElement toolBar;


    @FindBy(xpath = "//*[@id='Imagen']")
    WebElement photoBtn;
    @FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div[2]/div/button[1]/input")
    WebElement importFromPC;
    @FindBy(xpath = "")
    WebElement importFromPC_input;
    @FindBy(xpath = "")
    WebElement importFromPC_submit;



    @FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div[2]/div/button[2]")
    WebElement importFromUrl;
    @FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div[2]/div/div/input")
    WebElement importFromUrl_input;
    @FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div[3]/button[2]")
    WebElement importFromUrl_submit;

    @FindBy(xpath = "//*[@id='Video']")
    WebElement videoBtn;
    @FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div[2]/div/input")
    WebElement uploadVideo;
    @FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div[3]/div/div[2]/button")
    WebElement uploadBtn;

    @FindBy(xpath = "//*[@id='Video']")
    WebElement linkBtn;
    @FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div[2]/div/input")
    WebElement uploadLink;
    @FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div[3]/div/div[2]/button")
    WebElement uploadLinkBtn;


    @FindBy(xpath = "//*[@id='content']/div/div[5]/div/main/div[1]/section/div/div[2]/div/div[1]/div/textarea")
    WebElement commentInput;


    @FindBy(xpath = " //*[@id='content']/div/div[5]/div/main/div[1]/article/div[2]/div/div/div/div")
    WebElement aux;







    public WebDriver driver = null;

    public writePost_page(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    public void setPostTitle() {
        String title = "este es el titulo de prueba";

        System.out.println(title);

        //postTitle.click();
        postTitle.sendKeys(title);


    }

    public void setPostBody() {

        Actions builder = new Actions(driver);
        builder.moveToElement(postBody).perform();
        builder.moveToElement(postBody).click();
        builder.moveToElement(postBody).sendKeys(postContent).perform();

    }

    public void publishPost() {
        postPublish.click();


    }

    String postContent = "Gorgosaurus libratus (gr. ??????????, gorg??, 'terrible' y ?????????????, sauros, ??lagarto terrible??) es un dinosaurio ter??podo tiranos??urido, ??nica especie del g??nero monot??pico Gorgosaurus. Vivi?? a finales del per??odo Cret??cico, hace entre 76,5 y 75 millones de a??os, durante la edad Campaniense, en lo que hoy es Norteam??rica. Sus restos f??siles fueron encontrados en la provincia canadiense de Alberta. Otros restos, hallados en el estado de Montana, Estados Unidos, probablemente correspondan a este g??nero. Los paleont??logos admiten ??nicamente la especie G. libratus, aunque otras especies fueron incluidas err??neamente en este g??nero. Como todos los tiranos??uridos conocidos, Gorgosaurus fue un b??pedo depredador que en su madurez pesaba m??s de una tonelada y med??a nueve metros de largo. Mostraba docenas de afilados dientes alineados en sus mand??bulas, mientras que sus extremidades anteriores, con dos dedos, eran relativamente cortas. El g??nero Gorgosaurus est?? ??ntimamente emparentado con Albertosaurus y, en menor proporci??n, con Tyrannosaurus. Los f??siles de Gorgosaurus y Albertosaurus, de hecho, son extremadamente similares, distingui??ndose sutilmente por peque??as diferencias en los huesos del cr??neo y los dientes, lo que hace que algunos expertos consideren a G. libratus como una de las especies, un sin??nimo menor, del g??nero Albertosaurus.Gorgosaurus vivi?? en un exuberante ambiente inundable a lo largo de la costa del mar interior occidental. Fue un superdepredador, en la cima de la cadena alimenticia, conviviendo y aliment??ndose de abundantes cerat??psidos y hadros??uridos. En algunas ??reas, Gorgosaurus coexist??a con otro tiranos??urido, Daspletosaurus. Aunque estos animales eran aproximadamente del mismo tama??o, hay evidencia de que exist??a una separaci??n en distintos nichos ecol??gicos entre los dos. Gorgosaurus es el tiranos??urido mejor representado en el registro f??sil, con numerosos restos de espec??menes que permiten a los cient??ficos calcular con exactitud la ontogenia, desarrollo y otros aspectos de su biolog??a Gorgosaurus libratus (gr. ??????????, gorg??, 'terrible' y ?????????????, sauros, ??lagarto terrible??) es un dinosaurio ter??podo tiranos??urido, ??nica especie del g??nero monot??pico Gorgosaurus. Vivi?? a finales del per??odo Cret??cico, hace entre 76,5 y 75 millones de a??os, durante la edad Campaniense, en lo que hoy es Norteam??rica. Sus restos f??siles fueron encontrados en la provincia canadiense de Alberta. Otros restos, hallados en el estado de Montana, Estados Unidos, probablemente correspondan a este g??nero. Los paleont??logos admiten ??nicamente la especie G. libratus, aunque otras especies fueron incluidas err??neamente en este g??nero. Como todos los tiranos??uridos conocidos, Gorgosaurus fue un b??pedo depredador que en su madurez pesaba m??s de una tonelada y med??a nueve metros de largo. Mostraba docenas de afilados dientes alineados en sus mand??bulas, mientras que sus extremidades anteriores, con dos dedos, eran relativamente cortas. El g??nero Gorgosaurus est?? ??ntimamente emparentado con Albertosaurus y, en menor proporci??n, con Tyrannosaurus. Los f??siles de Gorgosaurus y Albertosaurus, de hecho, son extremadamente similares, distingui??ndose sutilmente por peque??as diferencias en los huesos del cr??neo y los dientes, lo que hace que algunos expertos consideren a G. libratus como una de las especies, un sin??nimo menor, del g??nero Albertosaurus.Gorgosaurus vivi?? en un exuberante ambiente inundable a lo largo de la costa del mar interior occidental. Fue un superdepredador, en la cima de la cadena alimenticia, conviviendo y aliment??ndose de abundantes cerat??psidos y hadros??uridos. En algunas ??reas, Gorgosaurus coexist??a con otro tiranos??urido, Daspletosaurus. Aunque estos animales eran aproximadamente del mismo tama??o, hay evidencia de que exist??a una separaci??n en distintos nichos ecol??gicos entre los dos. Gorgosaurus es el tiranos??urido mejor representado en el registro f??sil, con numerosos restos de espec??menes que permiten a los cient??ficos calcular con exactitud la ontogenia, desarrollo y otros aspectos de su biolog??a.Gorgosaurus libratus (gr. ??????????, gorg??, 'terrible' y ?????????????, sauros, ??lagarto terrible??) es un dinosaurio ter??podo tiranos??urido, ??nica especie del g??nero monot??pico Gorgosaurus. Vivi?? a finales del per??odo Cret??cico, hace entre 76,5 y 75 millones de a??os, durante la edad Campaniense, en lo que hoy es Norteam??rica. Sus restos f??siles fueron encontrados en la provincia canadiense de Alberta. Otros restos, hallados en el estado de Montana, Estados Unidos, probablemente correspondan a este g??nero. Los paleont??logos admiten ??nicamente la especie G. libratus, aunque otras especies fueron incluidas err??neamente en este g??nero. Como todos los tiranos??uridos conocidos, Gorgosaurus fue un b??pedo depredador que en su madurez pesaba m??s de una tonelada y med??a nueve metros de largo. Mostraba docenas de afilados dientes alineados en sus mand??bulas, mientras que sus extremidades anteriores, con dos dedos, eran relativamente cortas. El g??nero Gorgosaurus est?? ??ntimamente emparentado con Albertosaurus y, en menor proporci??n, con Tyrannosaurus. Los f??siles de Gorgosaurus y Albertosaurus, de hecho, son extremadamente similares, distingui??ndose sutilmente por peque??as diferencias en los huesos del cr??neo y los dientes, lo que hace que algunos expertos consideren a G. libratus como una de las especies, un sin??nimo menor, del g??nero Albertosaurus.Gorgosaurus vivi?? en un exuberante ambiente inundable a lo largo de la costa del mar interior occidental. Fue un superdepredador, en la cima de la cadena alimenticia, conviviendo y aliment??ndose de abundantes cerat??psidos y hadros??uridos. En algunas ??reas, Gorgosaurus coexist??a con otro tiranos??urido, Daspletosaurus. Aunque estos animales eran aproximadamente del mismo tama??o, hay evidencia de que exist??a una separaci??n en distintos nichos ecol??gicos entre los dos. Gorgosaurus es el tiranos??urido mejor representado en el registro f??sil, con numerosos restos de espec??menes que permiten a los cient??ficos calcular con exactitud la ontogenia, desarrollo y otros aspectos de su biolog??a.Gorgosaurus libratus (gr. ??????????, gorg??, 'terrible' y ?????????????, sauros, ??lagarto terrible??) es un dinosaurio ter??podo tiranos??urido, ??nica especie del g??nero monot??pico Gorgosaurus. Vivi?? a finales del per??odo Cret??cico, hace entre 76,5 y 75 millones de a??os, durante la edad Campaniense, en lo que hoy es Norteam??rica. Sus restos f??siles fueron encontrados en la provincia canadiense de Alberta. Otros restos, hallados en el estado de Montana, Estados Unidos, probablemente correspondan a este g??nero. Los paleont??logos admiten ??nicamente la especie G. libratus, aunque otras especies fueron incluidas err??neamente en este g??nero. Como todos los tiranos??uridos conocidos, Gorgosaurus fue un b??pedo depredador que en su madurez pesaba m??s de una tonelada y med??a nueve metros de largo. Mostraba docenas de afilados dientes alineados en sus mand??bulas, mientras que sus extremidades anteriores, con dos dedos, eran relativamente cortas. El g??nero Gorgosaurus est?? ??ntimamente emparentado con Albertosaurus y, en menor proporci??n, con Tyrannosaurus. Los f??siles de Gorgosaurus y Albertosaurus, de hecho, son extremadamente similares, distingui??ndose sutilmente por peque??as diferencias en los huesos del cr??neo y los dientes, lo que hace que algunos expertos consideren a G. libratus como una de las especies, un sin??nimo menor, del g??nero Albertosaurus.Gorgosaurus vivi?? en un exuberante ambiente inundable a lo largo de la costa del mar interior occidental. Fue un superdepredador, en la cima de la cadena alimenticia, conviviendo y aliment??ndose de abundantes cerat??psidos y hadros??uridos. En algunas ??reas, Gorgosaurus coexist??a con otro tiranos??urido, Daspletosaurus. Aunque estos animales eran aproximadamente del mismo tama??o, hay evidencia de que exist??a una separaci??n en distintos nichos ecol??gicos entre los dos. Gorgosaurus es el tiranos??urido mejor representado en el registro f??sil, con numerosos restos de espec??menes que permiten a los cient??ficos calcular con exactitud la ontogenia, desarrollo y otros aspectos de su biolog??a.Gorgosaurus libratus (gr. ??????????, gorg??, 'terrible' y ?????????????, sauros, ??lagarto terrible??) es un dinosaurio ter??podo tiranos??urido, ??nica especie del g??nero monot??pico Gorgosaurus. Vivi?? a finales del per??odo Cret??cico, hace entre 76,5 y 75 millones de a??os, durante la edad Campaniense, en lo que hoy es Norteam??rica. Sus restos f??siles fueron encontrados en la provincia canadiense de Alberta. Otros restos, hallados en el estado de Montana, Estados Unidos, probablemente correspondan a este g??nero. Los paleont??logos admiten ??nicamente la especie G. libratus, aunque otras especies fueron incluidas err??neamente en este g??nero. Como todos los tiranos??uridos conocidos, Gorgosaurus fue un b??pedo depredador que en su madurez pesaba m??s de una tonelada y med??a nueve metros de largo. Mostraba docenas de afilados dientes alineados en sus mand??bulas, mientras que sus extremidades anteriores, con dos dedos, eran relativamente cortas. El g??nero Gorgosaurus est?? ??ntimamente emparentado con Albertosaurus y, en menor proporci??n, con Tyrannosaurus. Los f??siles de Gorgosaurus y Albertosaurus, de hecho, son extremadamente similares, distingui??ndose sutilmente por peque??as diferencias en los huesos del cr??neo y los dientes, lo que hace que algunos expertos consideren a G. libratus como una de las especies, un sin??nimo menor, del g??nero Albertosaurus.Gorgosaurus vivi?? en un exuberante ambiente inundable a lo largo de la costa del mar interior occidental. Fue un superdepredador, en la cima de la cadena alimenticia, conviviendo y aliment??ndose de abundantes cerat??psidos y hadros??uridos. En algunas ??reas, Gorgosaurus coexist??a con otro tiranos??urido, Daspletosaurus. Aunque estos animales eran aproximadamente del mismo tama??o, hay evidencia de que exist??a una separaci??n en distintos nichos ecol??gicos entre los dos. Gorgosaurus es el tiranos??urido mejor representado en el registro f??sil, con numerosos restos de espec??menes que permiten a los cient??ficos calcular con exactitud la ontogenia, desarrollo y otros aspectos de su biolog??a.Gorgosaurus libratus (gr. ??????????, gorg??, 'terrible' y ?????????????, sauros, ??lagarto terrible??) es un dinosaurio ter??podo tiranos??urido, ??nica especie del g??nero monot??pico Gorgosaurus. Vivi?? a finales del per??odo Cret??cico, hace entre 76,5 y 75 millones de a??os, durante la edad Campaniense, en lo que hoy es Norteam??rica. Sus restos f??siles fueron encontrados en la provincia canadiense de Alberta. Otros restos, hallados en el estado de Montana, Estados Unidos, probablemente correspondan a este g??nero. Los paleont??logos admiten ??nicamente la especie G. libratus, aunque otras especies fueron incluidas err??neamente en este g??nero. Como todos los tiranos??uridos conocidos, Gorgosaurus fue un b??pedo depredador que en su madurez pesaba m??s de una tonelada y med??a nueve metros de largo. Mostraba docenas de afilados dientes alineados en sus mand??bulas, mientras que sus extremidades anteriores, con dos dedos, eran relativamente cortas. El g??nero Gorgosaurus est?? ??ntimamente emparentado con Albertosaurus y, en menor proporci??n, con Tyrannosaurus. Los f??siles de Gorgosaurus y Albertosaurus, de hecho, son extremadamente similares, distingui??ndose sutilmente por peque??as diferencias en los huesos del cr??neo y los dientes, lo que hace que algunos expertos consideren a G. libratus como una de las especies, un sin??nimo menor, del g??nero Albertosaurus.Gorgosaurus vivi?? en un exuberante ambiente inundable a lo largo de la costa del mar interior occidental. Fue un superdepredador, en la cima de la cadena alimenticia, conviviendo y aliment??ndose de abundantes cerat??psidos y hadros??uridos. En algunas ??reas, Gorgosaurus coexist??a con otro tiranos??urido, Daspletosaurus. Aunque estos animales eran aproximadamente del mismo tama??o, hay evidencia de que exist??a una separaci??n en distintos nichos ecol??gicos entre los dos. Gorgosaurus es el tiranos??urido mejor representado en el registro f??sil, con numerosos restos de espec??menes que permiten a los cient??ficos calcular con exactitud la ontogenia, desarrollo y otros aspectos de su biolog??a..";

    public void selectChannel() {
/*        Actions builder = new Actions(driver);
        builder.moveToElement(channel).perform();
        builder.moveToElement(channel).click();
*/
        channel.click();
    }

    public void searchChannel() {
        channelText.sendKeys("star");
    }

    public void selectChannelOption() {
        channelOption.click();
    }

    public void pressPhoto() {

        Actions builder = new Actions(driver);
        builder.moveToElement(toolBar).perform();
        builder.moveToElement(photoBtn).click().perform();

    }

    public void addUrlPhoto() {
        Actions builder = new Actions(driver);
        builder.moveToElement(importFromUrl).perform();
        builder.moveToElement(importFromUrl).click().perform();
        builder.moveToElement(importFromUrl_input).perform();
        builder.moveToElement(importFromUrl_input).click().perform();
        importFromUrl_input.sendKeys("https://fotografias.lasexta.com/clipping/cmsimages02/2018/04/19/D1D14B25-F4E2-4D92-8E2B-D9282997F66B/58.jpg");
        importFromUrl_submit.click();
    }
    public void addLocalPhoto()
    {
        Actions builder = new Actions(driver);
        builder.moveToElement(importFromUrl).perform();
        builder.moveToElement(importFromUrl).click().perform();
        builder.moveToElement(importFromUrl_input).perform();
        builder.moveToElement(importFromUrl_input).click().perform();
        importFromUrl_input.sendKeys("https://fotografias.lasexta.com/clipping/cmsimages02/2018/04/19/D1D14B25-F4E2-4D92-8E2B-D9282997F66B/58.jpg");
        importFromUrl_submit.click();
    }




    public void pressVideo() {

        Actions builder = new Actions(driver);
        builder.moveToElement(toolBar).perform();
        builder.moveToElement(videoBtn).click().perform();
        //photoBtn.click();
    }

    public void addUrlVideo() {
      /*  Actions builder = new Actions(driver);
        builder.moveToElement(uploadVideo).perform();
        builder.moveToElement(uploadVideo).click().perform();

       */
        uploadVideo.sendKeys("https://www.youtube.com/watch?v=vQGQhbUmnos");
        uploadBtn.click();
    }

    public void pressLink() {
        Actions builder = new Actions(driver);
        builder.moveToElement(toolBar).perform();
        builder.moveToElement(linkBtn).click().perform();
    }

    public void addUrlLink() {
        uploadLink.sendKeys("www.google.com");
        uploadLinkBtn.click();
    }

    public void pressNsfw() {

    postNSFWbtn.click();
    }

    public void addtag(int i) {

for (int a=0;a<i;a++)
                {
                    postTags.sendKeys("tag"+a);
                    postTags.sendKeys(Keys.SPACE);
                }
    }


    public void writecomment() {


        Actions builder = new Actions(driver);
        builder.moveByOffset(500,500).click().perform();
        commentInput.click();
        builder.moveToElement(commentInput).sendKeys(postContent);
        builder.moveToElement(commentInput).perform();

    }
}
