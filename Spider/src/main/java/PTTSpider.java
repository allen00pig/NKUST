import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PTTSpider {
    public static void main(String[] args) {                                                                             //PTT主標題
        try {
            Document doc = Jsoup.connect("https://www.ptt.cc/bbs/index.html").get();
            System.out.println(doc.title());
            Elements Text1 = doc.getElementsByClass("b-ent");

            for (Element Texts : Text1) {

                String BoardName = Texts.getElementsByClass("board-name").get(0).text();                        //看板名稱
                System.out.println("Board: " + BoardName);
                String BoardTitle = Texts.getElementsByClass("board-title").get(0).text();
                System.out.println("Article title: " + BoardTitle);                                                      //看板標題
                Document doc1 = Jsoup.connect("https://www.ptt.cc/bbs/" + BoardName + "/index.html").get();
                Elements Url = doc1.select("#main-container div.r-list-container.action-bar-margin.bbs-screen a");

                for (Element Urls : Url) {

                    Elements Text = doc1.getElementsByClass("r-ent");

                    for (Element Url2 : Text) {

                        Document doc2 = Jsoup.connect(Urls.absUrl("href")).get();
                        Elements Push = doc2.getElementsByClass("push");

                        for (Element Pushs : Push) {                                                                     //推文
                            String userId = Pushs.getElementsByClass("push").get(0).getElementsByTag("span").get(1).text();
                            String Comment = Pushs.getElementsByClass("push").get(0).getElementsByTag("span").get(2).text();
                            System.out.println("Comment:" + userId + Comment);
                            break;

                        }

                        break;

                    }

                    break;

                }
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
