./gradlew :android:publish
sleep 3
./gradlew :framework:publish
sleep 3
./gradlew :libart:publish
sleep 3
./gradlew :libcore:publish

