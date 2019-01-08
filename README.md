# test && commit || revert

This repo contains the skeleton project for trying a simple kata with test && commit || revert (TCR) at XTC London on the 8th of January.

You can run the main test cycle with:
```bash
./gradlew test && git commit -am working || git reset --hard
```

If you are trying out Limbo, it's recommended to also be running this in the background.
```bash
while(true);
do
  git pull -- rebase;
  git push;
done;
```
