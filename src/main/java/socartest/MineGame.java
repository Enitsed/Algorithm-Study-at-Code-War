package socartest;

import java.util.*;

/*
    [과제명 : 지뢰찾기]
    지뢰찾기와 유사한 게임을 제작한다고 가정하고 아래 조건에 따라서
    [각 사각형에 표시될 숫자를 "출력"하는 로직]을 작성해주세요.
     * 언어는 자율이며, 의사코드(pseudo code)도 무관하나 완결된 로직이어야함
     * UI 및 게임 요소 등은 구현 대상에 포함되지 않음
     * 사각형은 가로 10줄, 세로 10줄임
     * 지뢰는 10개이며 가급적 랜덤에 가깝게 배치해야함
     * 각 사각형에 표시될 숫자는, 자신을 제외한 주변 8개 사각형에 포함된 폭탄의 갯수임
     * 모든 사각형(100개)에 대한 숫자를 구해야함 (지뢰를 별도 flag로 표기하지 말 것)
*/
public class MineGame {
    private int[][] gameTable;
    private Stack<Map<String, Integer>> minesLocation;
    private int totalMineCount;


    public MineGame(int x, int y, int mineCounts) {
        this.gameTable = new int[x][y];
        this.totalMineCount = mineCounts;
        initGameTable();

        for (Map<String, Integer> mine : this.minesLocation) {
            System.out.println("지뢰 좌표 : " + mine);
            this.countMine(mine.get("locX"), mine.get("locY"), mine);
        }
    }

    // 지뢰 판 초기화
    public void initGameTable() {
        // 지뢰 깔기
        this.minesLocation = installMine();
    }

    // 지뢰 설치
    public Stack<Map<String, Integer>> installMine() {
        Stack<Map<String, Integer>> mines = new Stack<>();

        // 지뢰가 모두 설치 될 때 까지 반복
        while (mines.size() < this.totalMineCount) {
            int tempXLoc = (int) Math.floor(Math.random() * 10);
            int tempYLoc = (int) Math.floor(Math.random() * 10);

            Map placeMine = new HashMap<String, Integer>();
            placeMine.put("locX", tempXLoc);
            placeMine.put("locY", tempYLoc);

            // 중복 위치에 나오는 지뢰 처리 필요함
            if (mines.contains(placeMine)) {
                continue;
            }

            mines.push(placeMine);
        }

        return mines;
    }

    // 지뢰가 놓인곳 주변 카운트 증가 메서드
    public void countMine(int x, int y, Map<String, Integer> temp) {
        Stack<Map<String, Integer>> updatingArea = new Stack<>();

        // 지뢰가 깔려 있는 주변에 테이블 영역 안인지 확인하기 위해 테이블 내 영역 좌표를 넣고 검증
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                Map<String, Integer> areaToBeUpdated = new HashMap<>();
                areaToBeUpdated.put("locX", x + i);
                areaToBeUpdated.put("locY", y + j);

                // 유효 영역의 경우에만 스택에 넣는다.
                if (isValidArea(areaToBeUpdated.get("locX"), areaToBeUpdated.get("locY"))) {
                    if (temp.equals(areaToBeUpdated)) {
                        // 해당 지뢰가 깔린 위치는 카운팅 하지 않는다.
                        continue;
                    }
                    updatingArea.push(areaToBeUpdated);
                }
            }
        }

        for (Map<String, Integer> area : updatingArea) {
            // 주변에 있는 지뢰 카운팅
            this.gameTable[area.get("locX")][area.get("locY")] += 1;
        }

    }

    // 개수 증가 시킬 곳이 게임테이블 밖인지 안인지 체크하는 로직
    public boolean isValidArea(int x, int y) {
        // x,y 영역이 -1 이거나 10 이상일 경우 테이블 영역 밖임
        if (x < 0 || x > 9 || y < 0 || y > 9) {
            return false;
        }
        return true;
    }

    // 지뢰 판 결과 출력
    public void playGame() {
        for (int i = 0; i < this.gameTable.length; i++) {
            for (int j = 0; j < this.gameTable[i].length; j++) {
                System.out.print("|" + this.gameTable[i][j]);
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        MineGame mg = new MineGame(10, 10, 10);

        mg.playGame();
    }
};

