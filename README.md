# Task-Manager-Back
## 動作確認方法
### 1．起動方法(バック側)
#### ターミナルにて以下のコマンドを実行して起動を行う
./gradlew bootRun

## 1. モデル・DB設計の方針
モデル：

DB設計：![postgresql](https://img.shields.io/badge/-postgresql-4169E1?style=flat&logo=postgresql&logoColor=white)

現在の現場や他の現場でも利用していたことを思い出し、

Postgresデータを管理することに採用決定

## 2.TODO 今後の拡張ポイントと、それに配慮した設計の意識
1. ダークモード（No2とほぼ同時に対応することになるかも）
2. スマートフォンでも利用可能（レスポンシブ対応　WEB版）
3. AIによる画像処理（画像からテキスト変換しタスク化できるようにする）
4. Excelなどのファイルをアップロード・ダウンロードをできるようにする

## 3. API の使い方
POSTMANを想定予定（そのほかにいいものがあったらそちらを利用）

## 4. 環境構築方法・テスト実行手順
テスト実行に関しては、

今回の現場で利用する予定のJUnit・Jacocoを利用してキャッチアップをしていきたいと考えています。

大まかに85～95％を目標にバグの修正などを行って実施していく予定

### Lang
![openjdk](https://img.shields.io/badge/-java:18-000000?style=flat&logo=openjdk&logoColor=white)
### FW
![Spring Boot](https://img.shields.io/badge/-springboot:3.2.5-6DB33F?style=flat&logo=springboot&logoColor=white)
### ORM
![hibernate](https://img.shields.io/badge/-hibernate-59666C?style=flat&logo=hibernate&logoColor=white)
### TooL
![sonarqube](https://img.shields.io/badge/-sonarqube-4E9BCD?style=flat&logo=sonarqube&logoColor=white)

