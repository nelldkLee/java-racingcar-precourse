# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록
- [x] 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능
- [ ] 사용자는 몇 번의 이동을 할 것인지 입력할 수 있음
- [ ] 전진하는 자동차를 출력할 때, 자동차 이름을 같이 출력함
- [ ] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있음
  - [ ] 전진 조건은 0~9 사이의 random 값을 구하고 4이상일 경우 전진하고 3이하일 경우 멈춤
- [ ] 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려줌
  - [ ] 우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해서 출력
- [ ] 사용자가 잘못된 값을 입력할 경우 "[ERROR]" 로 시작하는 에러메세지 출력 후 다시 입력 받음
