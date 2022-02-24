import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import src.app.ClickerServ;

@RestController
public class ClickControl {
    @Autowired
    private ClickerServ clickerServ;

    @GetMapping
    int getScore(){
        return clickerServ.getScore();
    }

    @PostMapping("/click")
    void clickerModel(@RequestBody int clickCount) {
        clickerServ.click(clickCount);
    }

}