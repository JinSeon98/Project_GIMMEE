package present;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Present {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //선물 고유 번호
    private int choice = 0; //선택받은 횟수 저장

    public Present(Long id, int choice) {
        this.id = id;
        this.choice = choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public int getChoice() {
        return choice;
    }
}
