package JavaTestReady;

public class Dropship extends Unit {// 수송선
    int x, y; // 현재 위치
    @Override
    void move(int x, int y) { /* 지정된 위치로 이동 */ }
    @Override
    void stop() { /* 현재 위치에 정지 */ }
    void load() { /* 선택된 대상을 태운다.*/ }
    void unload() { /* 선택된 대상을 내린다.*/ }


}
