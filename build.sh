./gradlew build

# shellcheck disable=SC2164
cd build/distributions/

# shellcheck disable=SC2035
mv * ../../src/main/html

ls

trap 'sleep 5' EXIT