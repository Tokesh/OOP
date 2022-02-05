   
   class Game {
    private Map _map;
    private Player _player;
    
    void setMap(Map map) {
    this._map = map;
    }
    
    void addPlayer(Player player) {
    this._player = player;
    _player.setMap(_map);
    player.getPosition();
    }
    
    Game(Map map) {
    this._map = map;
    }
    
    }
    
    class MyPlayer implements Player {
    private Map _map;
    private Position position;
    public void moveRight() {
    if(position.getX() + 1 < _map.map.length && _map.map[position.getY()][position.getX() + 1] == '0'){
        position.setX(position.getX() + 1);
        _map.map[position.getY()][position.getX()] = 'P';
        _map.map[position.getY()][position.getX() - 1] = '0';
    }
    }
    
    public void moveLeft() {
    if(position.getX() - 1 >= 0 && _map.map[position.getY()][position.getX() - 1] == '0'){
    position.setX(position.getX() - 1);
    _map.map[position.getY()][position.getX()] = 'P';
    _map.map[position.getY()][position.getX() + 1] = '0';
    }
    }
    
    public void moveUp() {
    if(position.getY() - 1 >= 0 && _map.map[position.getY() - 1][position.getX()] == '0'){
    position.setY(position.getY() - 1);
    _map.map[position.getY()][position.getX()] = 'P';
    _map.map[position.getY() + 1][position.getX()] = '0';
    }
    }
    
    public void moveDown() {
    if(position.getY() + 1 < _map.map.length && _map.map[position.getY() + 1][position.getX() ] == '0'){
    position.setY(position.getY() + 1);
    _map.map[position.getY()][position.getX()] = 'P';
    _map.map[position.getY() - 1][position.getX()] = '0';
    }
    }
    public void setMap(Map map) {
        _map = map;
        for(int i = 0; i < _map.map.length; i++) {
            for(int j = 0; j < _map.map.length; j++) {
                if(_map.map[i][j] == 'P') {
                    position = new Position(j,i);
                }
            }
        }
    }
    public Position getPosition() {
    return position;
    }
    }
    
