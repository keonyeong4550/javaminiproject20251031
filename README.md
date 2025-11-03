# javaMiniProject
### 박건영

[Notion javaMiniProject 개발일지](https://www.notion.so/javaminiproject20251031-29c070b6eee68007b0b5c1cc664d1a0c?source=copy_link)


# 프로젝트 개요

## 직장에서 일을 하는 동안 “회계” 업무를 주로 하였고, 
자바로 만들어 보고 싶었다.

직장을 떠나고 시작한 직업훈련 기간중에 배운 자바만을 가지고 나의 회계업무 경험을 더해서 생각만 했던 회계프로그램 로직을 구현해 보는 것이 나의 자바 기술 활용의 첫 걸음이라고 생각한다. 
프로그램으로는 간단해 보이지만 이 프로젝트에는 **try-catch문, collection문 extends(상속) 과 interface 구현**  ****을 담았다. 프로젝트를 손수 만듦으로써 배웠던 스킬을 익히고 다음 단계로 넘어가기 위한 준비과정이라고 생각한다. 노벨상을 연속으로 받고 있는 구글을 보면, 업무에 집중만은 하지 않는다. 업무 외에 창의적인 **“딴짓”** 을 권장하는 분위기이고, 그러는 의미에서 회계 프로그램과 간단한 게임을 접목해 봤다. 

## #.1 프로젝트 환경구성

나는 프로젝트를 구현하기 이전에 기획을 먼저 잡아야한다고 뇌에 각인시켜놨다. **방향성이 없고 열심히 하면 금방 망한다**고 한다. 이 프로젝트의 골격과 의미를 어떻게 부여할 것이며, 최종적으로 어떤 모습으로 결과를 보여줄 것인지에 대한 집중 탐구가 필요했다. 이에 따라서, 나는 이 프로젝트를 성공적으로 **기획-설계-구현-프로젝트 제출** 을 하기 위해서 프로젝트 초반에 반드시 알아야할 환경구성부터 공략을 했다. 이 프로젝트의 환경구성은 [**이클립스, 깃허브, 소스트리]** 를 연동 하는 것 부터 시작하였다.  

1. **GitHub에 저장소 만들기**
2. **이클립스 프로젝트 폴더를 SourceTree에 등록하기**
3. **로컬 Git 초기화 및 커밋하기**
4. **GitHub 원격 저장소(origin) 연결 후 Push**

이 과정을 거쳐서 깃허브에 성공적으로 저장되는 것을 확인했다.

## #.2  클래스 다이어그램
![Image](https://github.com/user-attachments/assets/2737af63-f099-4c1e-a0f8-d9e696a5284d)

## #.3 구현
![Image](https://github.com/user-attachments/assets/0fb46f54-6ff6-4455-8925-e3a92bf9e2fe)

## #.4 오류 정정
회계 프로그램을 숫자 위주로 짰고, 한글로 입력 했는데, NumberFormatException 이 발생하였다.
<img width="752" height="131" alt="Image" src="https://github.com/user-attachments/assets/73590fc7-688a-48bb-aed0-51ac75415844" />

catch 문에 NumberFormatException 처리를 하였다. </br>
<img width="495" height="43" alt="Image" src="https://github.com/user-attachments/assets/af3dd208-4056-4028-a6a7-b1375638951e" />

## #.5 잔액 출력 부분 구현 코드
<img width="743" height="73" alt="Image" src="https://github.com/user-attachments/assets/d57a8991-23c9-44e9-baca-96e7ceadf58c" />

## #.6 적용기술
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">

## #.7 프로젝트 개발 후기
### 처음부터 모든 과정을 진행하면서..
처음부터 모든 과정을 진행하면서, 하나의 프로젝트가 나오기까지, 지식의 깊이에 따라 프로젝트 결과가 달라진다는 것을 알았다. <strong>노력은 배반 하지 않는다.</strong>는 점을 들어, 언젠가는 노력의 결실을 맺겠다는 일념으로 프로젝트에 열심히 임했다. 개인 프로젝트를 자바로 구현하면서, 참 재미있는 게임도 만들어보고, 과정도 하나하나 기록하면서, 개발자로서 소양을 조금씩 갖춰나가는 기분으로, 매일매일 성장하는 느낌으로 양일간 프로젝트를 하였고, 그 마무리를 짓는다. 더 나은 기획과 더 나은 구현을 위해, 더 많이 그리고 깊이 알아야할 지식들이 우리 일상생활에 재미와 의미를 담아있길 바라며, 더 많이 노력해야할것을 알았다. 

