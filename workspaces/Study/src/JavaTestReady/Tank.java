package JavaTestReady;

public class Tank extends Unit{// 탱크
    int x, y; // 현재 위치
    @Override
    void move(int x, int y) { /* 지정된 위치로 이동 */ }
    @Override
    void stop() { /* 현재 위치에 정지 */ }
    void changeMode() { /* 공격모드를 변환한다. */}


}
