package aotumanbitmonster

class AutoMan {
  private var _name:String = ""
  private var _hp:Int = 100
  def this (name:String,hp:Int) = {
    this()
    this._name = name
    this._hp = hp
  }
  def name:String = _name
  def hp:Int = _hp
  def name_(name:String) = {
    this._name = name
  }
  def hp_(hp:Int) = {
    this._hp = hp
  }
  def Attack(m:Monster) = {
    val hurt:Int = (Math.random()*10+20).toInt //20~29
    var hp = m.hp - hurt
    if(hp > 0)
      m.hp_(hp)
    else
      m.hp_(0)
  }
  def HugeAttack(m:Monster) = {
    val hurt:Int = {
      if(m.hp * 0.75 > 60)
        (m.hp * 0.75).toInt
      else
        60
    }
    var hp = m.hp - hurt
    if(hp > 0)
      m.hp_(hp)
    else
      m.hp_(0)
  }
  def MagicAttack(ms:Array[Monster]) = {
    val hurt:Int = (Math.random()*10+15).toInt //15~25
    for(m <- ms){
      var hp = m.hp - hurt
      if(hp > 0)
        m.hp_(hp)
      else
        m.hp_(0)
    }
  }
}
