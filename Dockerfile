# ベースイメージ
FROM openjdk:17-jdk-slim

# 作業ディレクトリを設定
WORKDIR /app

# 必要なファイルをコピー
COPY . /app

# アプリケーションをビルド
RUN ./mvnw clean package

# アプリケーションを実行
CMD ["java", "-jar", "target/its-0.0.1-SNAPSHOT.jar"]
