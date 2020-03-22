package Expression

class TrigonometricExpression : UnaryExpression
{
    constructor(x: Expression) : super(x)

    override public fun solve(): Double
    {
        return Math.sin(Math.toRadians(this.x.solve()))
    }

    public fun solve(y: Int) : Double
    {
        var result = when(y) {
            1 -> Math.sin(Math.toRadians(this.x.solve()))
            2 -> Math.cos(Math.toRadians(this.x.solve()))
            3 -> Math.tan(Math.toRadians(this.x.solve()))
            else -> 0.0
        }
        return result
    }
}