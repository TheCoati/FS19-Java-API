# FS19 Java API

FS19 Java API is an utility for Farming Simulator 2019 Dedicated servers.<br>
The Java API provides easy access to the API and read data related to the dedicated server.

---

## Endpoints

- [x] Server Data **(** /feed/dedicated-server-stats.xml **)**
- [x] Map image **(** /feed/dedicated-server-stats.xml **)**
- [x] Career SaveGame **(** /feed/dedicated-server-stats-map.jpg **)**
- [ ] Vehicles Data **(** /feed/dedicated-server-savegame.html&file=vehicles **)**
- [ ] Economy Data  **(** /feed/dedicated-server-savegame.html&file=economy **)**

---
## Usage

**Step 1**<br>
Go to your Dedicated server settings.
![Alt text](./docs/img/fs19_dedicated_topbar.png?raw=true "Title")

**Step 2**<br>
Take note of the TLD or IP with port and the code tailing the URL.
![Alt text](./docs/img/fs19_dedicated_url.png?raw=true "Title")

**Step 3**<br>
Create a new `FarmingAPI` instance with the required parameters.
```java
 FarmingAPI api = new FarmingAPI("http://127.0.0.1:12700", "c532500b61a441858b7cb7ea930ba8be"); 
```

**Step 4**<br>
Request the required data from the API.
```java
try {
   System.out.println("Farmers online: " + api.getServer().getSlots().getNumUsed());
} catch (IOException e) {
   e.printStackTrace();
}
```


