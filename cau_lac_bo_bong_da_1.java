import java.util.*;

class Club {
    String id, name, priceTic;

    public Club(String id, String name, String priceTic) {
        this.id = id;
        this.name = name;
        this.priceTic = priceTic;
    }

    public String getName() {
        return name;
    }
}

class Match {
    Club clb;
    String id;
    int NOF, turnover;

    public Match(String id, int NOF) {
        this.id = id;
        this.NOF = NOF;
    }

    public void setCLB(Club clb) {
        this.clb = clb;
        turnover = Integer.valueOf(clb.priceTic) * NOF;
    }

    @Override
    public String toString() {
        return id + " " + clb.getName() + " " + turnover;
    }
}

public class cau_lac_bo_bong_da_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Club> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Club(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        ArrayList<Match> matches = new ArrayList<>();
        int m = Integer.valueOf(input.nextLine());
        for (int i = 0; i < m; i++) {
            String[] tmp = input.nextLine().split(" ");
            matches.add(new Match(tmp[0], Integer.valueOf(tmp[1])));
            for (Club j : arr) {
                if (matches.get(i).id.substring(1, 3).equals(j.id)) {
                    matches.get(i).setCLB(j);
                    break;
                }
            }
        }
        Collections.sort(matches, new Comparator<Match>() {
            @Override
            public int compare(Match o2, Match o1) {
                return o1.turnover - o2.turnover;
            }
        });
        for (Match match : matches) {
            System.out.println(match);
        }
    }
}