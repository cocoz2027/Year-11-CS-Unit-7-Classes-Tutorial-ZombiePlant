public class ZombiePlant {
    private int potency;
    private int treatmentNeeded;

    public ZombiePlant(int potency, int treatmentNeeded) {
        this.potency = potency;
        this.treatmentNeeded = treatmentNeeded;
    }

    public int getPotency() {
        return potency;
    }

    public int treatmentsNeeded() {
        return treatmentNeeded;
    }

    public boolean isDangerous() {
        return treatmentNeeded > 0;
    }

    public void treat(int treatmentPotency) {
        if (treatmentPotency <= 0) {
            return;
        } else if (treatmentPotency <= potency) {
            if (treatmentNeeded > 0) {
                treatmentNeeded--;
            }
        } else if (treatmentPotency > 0) {
            treatmentNeeded++;
        }
    }
}
  /*  public void treat(int potency){
        if (potency <= this.potency && this.treatmentNeeded >=1 && potency >= 0){
            this.treatmentNeeded = this.treatmentNeeded -1;
        }
        else {
            this.treatmentNeeded = this.treatmentNeeded -2;
        }
        return;
    }
}

   */
